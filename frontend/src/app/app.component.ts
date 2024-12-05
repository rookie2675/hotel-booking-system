import { Component, OnInit } from '@angular/core';
import { catchError, of, tap } from 'rxjs';
import { CommonModule } from '@angular/common';
import { RoomModel } from './models/RoomModel';
import { RoomService } from '../services/RoomService';
import { RoomCardComponent } from './room-card/room-card.component';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [CommonModule, RoomCardComponent],
})
export class AppComponent implements OnInit {
    rooms: RoomModel[];

    constructor(private roomService: RoomService) {
        this.rooms = [];
    }

    ngOnInit(): void {
        this.roomService
            .getAll()
            .pipe(
                tap((response: RoomModel[]) => {
                    this.rooms = response;
                }),
                catchError((error: Error) => {
                    console.error(
                        'Error fetching list of rooms from server:',
                        error.message
                    );
                    return of([]);
                })
            )
            .subscribe();
    }
}
