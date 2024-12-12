import { Component, Input } from '@angular/core';
import { RoomModel } from '../models/RoomModel';

@Component({
    selector: 'app-room-card',
    imports: [],
    templateUrl: './room-card.component.html',
    styleUrl: './room-card.component.css',
})
export class RoomCardComponent {
    @Input() room!: RoomModel;
}
