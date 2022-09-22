import React from "react";

const SimpleCheckbox = ({name, value, checked, isNew}) => {

    return (  
        <input 
            type="checkbox"
            name = {name}
            value = {value}
            checked = {checked}
            isNew = {isNew}
        />
    );

}

export default SimpleCheckbox;