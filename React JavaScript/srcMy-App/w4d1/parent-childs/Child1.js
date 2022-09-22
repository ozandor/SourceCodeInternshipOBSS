import React from "react";

class Child1 extends React.Component {

    componentDidMount(){
        console.log("Child1 MOUNTED.");
    }

    componentDidUpdate(prevProps,prevState){
        console.log("Child1 UPDATED.");
    }

    render(){
        console.log("Child1 RENDERED.");
        return (<div>Child1.</div>);
    }

}

export default Child1;