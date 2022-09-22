import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import ShoppingApp from "./shopping-app/ShoppingApp";
import Counter from "./w4d1/Counter";
import AutomatedCounter from "./w4d1/AutomatedCounter";
import Parent from "./w4d1/parent-childs/Parent";
import EventHandlers1 from "./w4d1/EventHandlers1";
import EventHandlers2 from "./w4d1/EventHandlers2";
import PersonList from './w4d2/ex1/PersonList';
import {ToastContainer} from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

// Compulsory method for configuring the toastify.
//toast.configure();

/*const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);*/

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();

const rootElement = document.getElementById("root");

//ReactDOM.render(ShoppingApp(),rootElement);// Ex1
//ReactDOM.render(<Counter/>,rootElement);
//ReactDOM.render(<AutomatedCounter/>,rootElement);
//ReactDOM.render(<Parent/>,rootElement);
//ReactDOM.render(<EventHandlers1/>,rootElement);
//ReactDOM.render(<EventHandlers2/>,rootElement);

ReactDOM.render(<><ToastContainer closeButton={false} position="bottom-right" /><PersonList/></>,rootElement);

