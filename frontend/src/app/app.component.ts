import { Component, OnInit } from "@angular/core";
import { catchError, tap } from "rxjs";
import { RoomService } from "../room/RoomService";
import { RoomModel } from "../room/RoomModel";
import { CommonModule } from "@angular/common";

@Component({
    selector: "app-root",
    templateUrl: "./app.component.html",
    styleUrl: "./app.component.css",
    imports: [CommonModule],
})
export class AppComponent implements OnInit {
    rooms: RoomModel[];

    constructor(private roomService: RoomService) {
        this.rooms = [];
    }

    ngOnInit() {
        this.roomService
            .getRooms()
            .pipe(
                tap((response) => {
                    console.log("Data fetched successfully:", response);
                }),
                catchError((error) => {
                    console.error("Error fetching data:", error);
                    return [];
                }),
            )
            .subscribe((response) => {
                this.rooms = response;
            });
    }
}
