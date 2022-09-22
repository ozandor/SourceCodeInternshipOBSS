import React from "react";

class HelloClass extends React.Component {
  render() {
    const { name } = this.props;
    return (
      <>
        <h1>Hello Class Component</h1>
        <p>Message: {name}</p>
      </>
    );
  }
}

export default HelloClass;
