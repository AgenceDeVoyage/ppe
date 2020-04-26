export class Voiture {
    private _Matricule: number;
    public get Matricule(): number {
        return this._Matricule;
    }
    public set Matricule(value: number) {
        this._Matricule = value;
    }
	private _Marque: String;
    public get Marque(): String {
        return this._Marque;
    }
    public set Marque(value: String) {
        this._Marque = value;
    }
	private _Type: String;
    public get Type(): String {
        return this._Type;
    }
    public set Type(value: String) {
        this._Type = value;
    }
	private _Capacite: number;
    public get Capacite(): number {
        return this._Capacite;
    }
    public set Capacite(value: number) {
        this._Capacite = value;
    }
    private _image: String;
    public get image(): String {
        return this._image;
    }
    public set image(value: String) {
        this._image = value;
    }
    public toString(){
        return this._Capacite;
    }
     constructor(Matricule:number,Marque:String,Type:String,Capacite:number,image:String){
        this.Marque=Marque;
        this.Matricule=Matricule;
        this.Type=Type;
        this.Capacite=Capacite;
        this.image=image;
    } 
}
