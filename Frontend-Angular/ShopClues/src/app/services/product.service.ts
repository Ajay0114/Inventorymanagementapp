import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = 'https://mfkdks9fl2.execute-api.ap-south-1.amazonaws.com/dev' //Api gateway built in amazon

  public cartAddedSubject = new Subject<boolean>();

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any[]> {
    debugger;
    return this.http.get<any[]>(`${this.baseUrl}/items`);
  }
  
  makeSale(salePayload: any, options?: any): Observable<any> {
    return this.http.post<any>(`${this.baseUrl}/salereq`, salePayload, options);
  }
}
