import React from "react";

class AutomatedCounter extends React.Component {
    constructor(probs){
        super(probs);
        this.state = {counter: 0};
    }

    render() {
        return <div>{this.state.counter}</div>;
    }

    componentDidMount() {
        this.interval = setInterval(
            () => this.setState( (prevState) => ({ counter: prevState.counter + 1}) ),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.interval);
    }


}

export default AutomatedCounter;