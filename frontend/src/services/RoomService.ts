import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable, of } from 'rxjs';
import { ApiService } from '../services/ApiService';
import { RoomModel } from '../app/models/RoomModel';

@Injectable({
    providedIn: 'root',
})
export class RoomService {
    private path: string;

    constructor(private httpClient: HttpClient, private apiService: ApiService) {
        this.path = '/room';
    }

    getAll(): Observable<RoomModel[]> {
        return this.httpClient.get<RoomModel[]>(this.apiService.getUrl() + this.path + '/get-all').pipe(
            map((response: RoomModel[]) => {
                return response.map((room) => ({
                    ...room,
                }));
            })
        );
    }
}
