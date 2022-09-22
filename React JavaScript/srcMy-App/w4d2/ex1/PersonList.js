import React from "react";
import "antd/dist/antd.css";
import {Table} from "antd";
import UserService from "./UserService";

const columnHeaders = [
    {
        title: "Name",
        dataIndex: "name",
        sorter: true,
        render: (name) => `${name.title} ${name.first} ${name.last}`, // We say render becuse of sync?
        width:"20%" 
    },
    {
        title: "Gender",
        dataIndex: "gender",
        filters: [ // Thanks to antd, it is directly configured.
            {text: "Male", value: "male"},
            {text: "Female", value: "female"}
        ],
        width: "20%"
    },
    {
        title: "Email",
        dataIndex: "email"
    }


]; // End of the header constant.


class PersonList extends React.Component{

    state = {
        data: [],
        pagination: {
            current: 1,
            pageSize: 10
        },
        loading: false // Becomes true in load screen at async fetch.
    };

    componentDidMount(){
        const {pagination} = this.state;
        this.fetch({pagination}); 
    }

    handleTableChange = (pagination, filters, sorter) => {
        this.fetch({
            sortField: sorter.field,
            sortOrder: sorter.order,
            pagination,
            ...filters
        });
    }

    fetch = async (params = {}) => { //Makes params at worst.
        this.setState({loading: true});

        const data = await UserService.fetchUsers(params);
        
        this.setState({ // After loading,
            loading: false,
            data: data && data.results, // If data exists check data.results then assign to data.
            pagination: {
                ...params.pagination,
                total: 200 // Mock data?
            }
        });

    }// End of fetch

    render(){
        const {data, pagination,loading} = this.state;

        return (
            <Table
                columns={columnHeaders}
                rowKey={(record) => record.login.uuid}
                dataSource={data}
                pagination={pagination}
                loading={loading}
                onChange={this.handleTableChange}
            />
        );


    }



}


export default PersonList;