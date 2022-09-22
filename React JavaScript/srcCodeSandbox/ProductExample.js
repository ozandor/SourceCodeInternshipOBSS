import ReactDOM from "react-dom";

export default function () {
  let product = { name: "milk", stock: 7 };

  const messagesMap = {
    stockEmpty: <h1>The product {product.name} not exists in our market.</h1>,

    stockExist: (
      <h1>
        The product {product.name} has {product.stock} units.{" "}
      </h1>
    )
  };

  // const productExistText = "The product {product.name} has {product.stock} units";
  /*  
  const messages = [
    
    <h1>The product {product.name} not exists in our market.</h1>,
    
    <h1>
    The product {product.name} has {product.stock} units.{" "}
    </h1>
  ];*/

  let element;

  if (product.stock <= 0) {
    element = messagesMap.stockEmpty;
  } else {
    element = messagesMap.stockExist;
  }

  ReactDOM.render(element, document.getElementById("root"));
}
