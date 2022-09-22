import React from "react";

class StateDisplay extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            message: "initial message",
            complexMessage: {
                innerSimpleMessage: "Inner Simple Message",
                innerComplexMessage: { message: "Inner Complex Message"}
            }
        };
    }

    componentDidMount();


}