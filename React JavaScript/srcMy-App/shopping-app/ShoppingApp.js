import ShoppingTitle from "./ShoppingTitle";
import ShoppingList from "./ShoppingList";
import ShoppingItem from "./ShoppingItem";

function ShoppingApp(){

    return (
        <>
            <ShoppingTitle TotalItemNum = "9"/>
            <ShoppingList nameList="Food" allItems={[<ShoppingItem nameItem="Bread"/>,"Apple","Better Bread"]}/>
            <ShoppingList nameList="Clothes" allItems={["Shirt","Pants","Hat"]}/>
            <ShoppingList nameList="Supplies" allItems={["Pen","Paper","Glue"]}/>
        </>
    );

}

export default ShoppingApp;