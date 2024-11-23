import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable, of } from "rxjs";
import { BookingModel } from "../booking/BookingModel";
import { RoomModel } from "./RoomModel";
import { RoomType } from "./RoomType";

@Injectable({
    providedIn: "root",
})
export class RoomService {
    private url = "http://localhost:8080";

    constructor(private httpClient: HttpClient) {}

    getRooms(): Observable<RoomModel[]> {
        return of([
            new RoomModel(1, RoomType.SINGLE, "101", []),
            new RoomModel(1, RoomType.DOUBLE, "102", []),
        ]);
        //return this.httpClient.get(this.url);
    }
}
