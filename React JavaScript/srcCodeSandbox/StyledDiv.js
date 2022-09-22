import ReactDOM from "react-dom";

function StyledDiv() {
  const styledObject = {
    backgroundColor: "Red",
    minHeight: 50,
    minWidth: 100,
    textAlign: "center",
    lineHeight: "50px",
    color: "yellow"
  };

  const div = <div style={styledObject}>Colors of the McQueen. Kachow! </div>;
  //const root = document.getElementById("root");
  //ReactDOM.render(div, root);
  return div;
}

export default StyledDiv;
