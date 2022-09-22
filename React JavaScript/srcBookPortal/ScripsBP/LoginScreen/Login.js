import React from "react";

function Login() { 

    const afterSubmit = (event) => {
        event.preventDefault();
    }

    const renderErrorMessage = (name) => {
/*
        if(name.equals("invName") ){

            return (<div>This user not exists.</div>);
            
        }else if(name.equals("invPass") ){

            return (<div>Invalid Password.</div>);

        }

        return (<div>Unknown error.</div>);
*/
    }


    const loginScreen = (
    <form onSubmit={afterSubmit}>
        <label>Username </label>
            <input type="text" name="uName" required />
            {renderErrorMessage("invName")}
        <br></br>
        <label>Password </label>
            <input type="password" name="pass" required />
            {renderErrorMessage("invPass")}
        <br></br>
        <input type="submit" value="GO!" />
    </form>
    );


    return (
        <div>
            <h1>Sign in</h1>
            <div>{loginScreen}</div>
        </div>
    );

}

export default Login;