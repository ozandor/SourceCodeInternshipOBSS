import { StrictMode } from "react";
import ReactDOM from "react-dom";
import incrementCounter from "./SimpleCounter";
import styledDiv from "./StyledDiv";
import ProductExample from "./ProductExample";
import Hello from "./Hello";
import HelloClass from "./HelloClass";

const rootElement = document.getElementById("root");

//var element = <h1> Hello JIP - 2022 </h1>

//ReactDOM.render(element, rootElement);
//ReactDOM.render(incrementCounter(), rootElement);
//ReactDOM.render(styledDiv(), rootElement);
//ProductExample();
/*ReactDOM.render(
  <StrictMode>
    <Hello />
  </StrictMode>,
  rootElement
);
*/
ReactDOM.render(
  <StrictMode>
    <HelloClass label={<label>Just a label</label>} name="Given name" />
  </StrictMode>,
  rootElement
);
