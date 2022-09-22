import React from "react";

class Child2 extends React.Component {

    componentDidMount(){
        console.log("Child2 MOUNTED.");
    }

    componentDidUpdate(prevProps,prevState){
        console.log("Child2 UPDATED.");
    }

    render(){
        console.log("Child2 RENDERED.");
        return (<div>Child2.</div>);
    }

}

export default Child2;