import React from "react";

class ShoppingTitle extends React.Component{

    render(){
        const {TotalItemNum} = this.props;
        return (
            <div>
                <h4>My Shopping List</h4>
                <p>Total Number of Items: {TotalItemNum}</p>
            </div>
        );
    }



}

export default ShoppingTitle;