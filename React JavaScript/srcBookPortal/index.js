import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Login from './ScripsBP/LoginScreen/Login';
import BookChanger from './ScripsBP/BookManipulate/BookChanger';

const rootElement = document.getElementById("root");

//ReactDOM.render(<Login/>,rootElement);
ReactDOM.render(<BookChanger/>,rootElement);