export class Hotel {
    private _idHotel: Number;
	
	private _nom: String;
	
	private _nbEtoile: number;

	private _adresse: String;

	private _mail: String;

	private _image: String;


	



public get idHotel(): Number {
	return this._idHotel;
}
public set idHotel(value: Number) {
	this._idHotel = value;
}
public get nom(): String {
	return this._nom;
}
public set nom(value: String) {
	this._nom = value;
}
public get nbEtoile(): number {
	return this._nbEtoile;
}
public set nbEtoile(value: number) {
	this._nbEtoile = value;
}	public get adresse(): String {
	return this._adresse;
}
public set adresse(value: String) {
	this._adresse = value;
}
public get mail(): String {
	return this._mail;
}
public set mail(value: String) {
	this._mail = value;
}
public get image(): String {
	return this._image;
}
public set image(value: String) {
	this._image = value;
}
constructor(IdHotel:number,Nom:String,Adresse:String,Mail:String,image:String,NbEtoile:number){
	this.idHotel=IdHotel;
	this.mail=Mail;
	this.nom=Nom;
	this.adresse=Adresse;
	this.nbEtoile=NbEtoile;
	this.image=image;
}
}