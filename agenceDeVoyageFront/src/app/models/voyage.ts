export class Voyage {
    private _id: number;

     private _nom: String;

     private _description: String;

     private _tarifP: String;

     private _tarifBc: String;

     private _tarifNc: String;

     private _nb: String;

    private _image: String;




public get id(): number {
return this._id;
}
public set id(value: number) {
this._id = value;
}
public get nom(): String {
return this._nom;
}
public set nom(value: String) {
this._nom = value;
}
public get description(): String {
return this._description;
}
public set description(value: String) {
this._description = value;
}
public get tarifP(): String {
return this._tarifP;
}
public set tarifP(value: String) {
this._tarifP = value;
}
public get tarifBc(): String {
return this._tarifBc;
}
public set tarifBc(value: String) {
this._tarifBc = value;
}
public get tarifNc(): String {
return 
this._tarifNc;
}
public set tarifNc(value: String) {
this._tarifNc = value;
}
public get nb(): String {
return this._nb;
}
public set nb(value: String) {
this._nb = value;
}
public get image(): String {
return this._image;
}
public set image(value: String) {
this._image = value;
}
constructor ( id: number,nom: String,description: String,tarifP: String,tarifBc: String,tarifNc: String,nb: String ,image:String ){

this.id=id;
this.tarifNc=tarifNc;
this.tarifP=tarifP;
this.tarifBc=tarifBc;
this.description=description;
this.nom=nom;
this.nb=nb;
this.image=image;
}
}
