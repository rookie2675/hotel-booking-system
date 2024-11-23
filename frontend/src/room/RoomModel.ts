import { BookingModel } from "../booking/BookingModel";
import { RoomType } from "./RoomType";

export class RoomModel {
    id: number;
    type: RoomType;
    number: string;
    bookings: BookingModel[];

    constructor(
        id: number,
        type: RoomType,
        number: string,
        bookings: BookingModel[],
    ) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.bookings = bookings;
    }
}
