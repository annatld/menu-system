import axios, { AxiosPromise } from "axios"
import { FoodData } from "../interface/FoodData";
import { useMutation} from "@tanstack/react-query";
const API_URL = "http://localhost:8083";

const postData=async(data: FoodData):AxiosPromise<any>=>{
    const response =axios.post(API_URL + "/food",data)
    return response;
}

export function useFoodDataMutate(){
    const mutate=useMutation({
        mutationFn: postData,
        retry:2,
    });
    return mutate;
}