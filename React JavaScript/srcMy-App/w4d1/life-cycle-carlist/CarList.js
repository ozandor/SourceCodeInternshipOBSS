import React from "react";
import SimpleCheckbox from "./SimpleCheckbox";
import SimpleTable from "./SimpleTable";

class CarList extends React.Component {
    static HEADER = ["Model","Year","Price"];

    constructor(props){
        super(props);
        this.state = {
            cars: [
                {model: "D", year:2000, price:8000},
                {model: "O", year:2001, price:12000},
                {model: "R", year:2002, price:14000},
                {model: "U", year:2003, price:9000},
                {model: "K", year:2004, price:34000}
            ],
            isNew: true,
            model: null
        }
    }

    componentDidMount(){
        console.log("CarList get mounted.");
    }

    componentDidUpdate(){
        console.log("CarList get updated.");
    }

    isNewChoiceChange = (event) => {
        this.setState({isNew: event.target.checked});
    }

    render() {
        console.log("CarList rendered");
        return (
        <>
            <div>
                <p>Filter options:</p>
                <SimpleCheckbox
                    name="New"
                    value="000"
                    checked={this.state.isNew}
                />
            </div>
        </>
        );

    }

}