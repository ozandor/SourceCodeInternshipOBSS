import React from "react";

class EventHandlers1 extends React.Component{
    constructor(props){
        super(props);
        this.state = {count:0}

        //With binding we can point to the necessary object
        this.clickHandler = this.clickHandler.bind(this);
    }

    clickHandler(){
        //increments the count
        this.setState( (prevState,props) => {return {count: prevState.count + 1} } );
    
    }

    render(){

        return <button onClick = {this.clickHandler}>{this.state.count}</button>        
    }

}

export default EventHandlers1;

