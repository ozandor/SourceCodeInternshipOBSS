import axios from "axios";
import {toast} from "react-toastify";

const UserService = (
    function(){

        
        toast.error("Error at response!", {autoClose: 10000});
        

        const _fetchUsers = async (params)=>{
            
            const response = await axios.get("https://randomuser.me/api", {
                params: {
                    results: params.pagination.pageSize,
                    page: params.pagination.current,
                    ...params
                }

            });


            if(!response){
                console.log("Error! There is no response");
                const notify = () => {
                    toast.error("Error at response!", {autoClose: 10000});
                }
                return;
            }

            return response.data;

        };

        const _fetchUsersPromise = (params) => {

            return axios.get(
                "https://randomuser.me/api",{
                    params: {
                        results: params.pagination.pageSize,
                        page: params.pagination.current,
                        ...params
                    }
                }
            ).then( (response) => {
                    if(!response) {
                        console.log("Error! There is no response");
                        const notify = () => {
                            toast.error("Error at response!", {autoClose: 10000});
                        }
                    }
                    return response.data;
                }
            );


        };

    
        return {fetchUsers: _fetchUsers};

    }//end of the function

)();

export default UserService;