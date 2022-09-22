import React from "react";

function BookChanger() {

    return (
    <div>
        <h2>Add a book.</h2>
        <form>
            <input type="text" name="bookName" placeholder="Name of the book."/>
            <br/>
            <input type="text" name="bookAuthor" placeholder="Author of the book."/>
            <br/>
            <input type="submit" name="submitBook" value="Add this book."/>
        </form>
        <h2>Remove a book.</h2>
        <form>
            <input type="text" name="bookNameR" placeholder="Name of the book."/>
            <br/>
            <input type="text" name="bookAuthorR" placeholder="Author of the book."/>
            <br/>
            <input type="submit" name="submitBookR" value="Remove this book."/>
        </form>
    </div>
    );

}

// Add and remove handlers are not implemented.
function BookAdd() {



}


export default BookChanger;