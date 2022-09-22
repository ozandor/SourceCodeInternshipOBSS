import ReactDOM from "react-dom";

export default function () {
  let counter = 1000;

  function getIncrementedCounter() {
    return counter++;
  }

  function incrementCounter() {
    let counterDiv = <div>{getIncrementedCounter()}</div>;
    const rootElement = document.getElementById("root");

    ReactDOM.render(counterDiv, rootElement);
  }

  setInterval(incrementCounter, 500);
}
