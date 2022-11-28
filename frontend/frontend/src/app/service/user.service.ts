import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { UserDto } from 'src/app/pages/login/user.dto';

const url = 'http://localhost:8080/auth'

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient){ }

  public registration(body: any) : Observable<any>{ 
    console.log(body);
    return this.http.post(url + `/registration`, body);
  }

  public login(userDto: UserDto) : Observable<any>{ 
    return this.http.post<any>(url + `/login`, userDto, { responseType: 'text' as 'json'});
  }
}
