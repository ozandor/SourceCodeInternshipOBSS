import React from "react";

class EventHandlers2 extends React.Component{

    constructor(props){
        super(props)
        this.state = {activeArray:[0,0], name:"initialName"}
        this.clickHandler = this.clickHandler.bind(this);
    }

    clickHandler(id,name){
        var arr = [0,0]
        arr[id] = 1
        this.setState({activeArray:arr,name:name});
    }

    render(){
        return(
            <div>
                <Button id = {0} active = {this.state.activeArray[0]}
                    clickHandler = {this.clickHandler} name ="bob"/>
                <Button id = {1} active = {this.state.activeArray[1]}
                    clickHandler = {this.clickHandler} name ="pop"/>
                <Button id = {2} active = {this.state.activeArray[2]}
                    clickHandler = {this.clickHandler} name ="qoq"/>
                <Button id = {3} active = {this.state.activeArray[3]}
                    clickHandler = {this.clickHandler} name ="dod"/>
            </div>
        );
    }

    

}

class Button extends React.Component{
    render(){
        return(
            <button style = {{color:this.props.active ? 'red':'blue'}}
            onClick = {() => {this.props.clickHandler(this.props.id,this.props.name)}}>
                {this.props.name}
            </button>
        );
    }
}
/*
const EventHandlers2 = () => {
    

}*/

export default EventHandlers2;