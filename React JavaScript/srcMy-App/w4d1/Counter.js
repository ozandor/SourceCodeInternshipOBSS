import React, { useEffect,useState } from "react";

//false counter increment

class Counter extends React.Component{
    constructor(props){
        super(props);
        this.state = {val:0};
    }

    componentDidMount(){
        this.setState((prevState, props) => {
            return {val:prevState.val + 1};
        });
        this.setState((prevState, props) => {
            return {val:prevState.val + 1};
        });
    }

    render(){
        return <div>Counter:{this.state.val}</div>;
    }

}



/*
const Counter = () => {
    const [value, setValue] =  useState({val: 0});

    useEffect( () =>{
        
        setValue({...value, val: value.val+1});

    }, []);

    return (
        <div>
            val:{value.val}
        </div>
    );

}*/

export default Counter;