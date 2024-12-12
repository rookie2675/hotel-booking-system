import { BookingModel } from '../../booking/BookingModel';
import { RoomType } from '../../room/RoomType';

export interface RoomModel {
    id: number;
    type: RoomType;
    number: string;
    bookings: BookingModel[];
}
