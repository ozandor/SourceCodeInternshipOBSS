import ShoppingItem from "./ShoppingItem";
function ListItem( {ShoppingItem} ){

    return <li>{ShoppingItem}</li>;

}

function ShoppingList({nameList,allItems}){

    return (
        <div>
            <h2>{nameList}</h2>
            
            <ol>
                {allItems && allItems.map( (ShoppingItem) => <ListItem key={ShoppingItem} ShoppingItem={ShoppingItem}/> )}
            </ol>
            
        </div>
    );

}

export default ShoppingList;