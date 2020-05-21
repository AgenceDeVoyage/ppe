
export class Client {
    private id:number;
	private  nom:String;
	private  civilite:String;
	private  genre:String;
	private  nationalite:String;
	private  idPassport:number;
	private  dateExp :Date;
    private prenom:String;
    private  mail:String;


  key: any;

   constructor(id:number,nom:String, civilite:String, genre:String, nationalite:String,
 idPassport:number, dateExp :Date,prenom:String,mail:String){
        this.id=id;
        this.mail=mail;
        this.nom=nom;
        this.prenom=prenom;
        this.civilite=civilite;
        this.dateExp=dateExp;
        this.genre=genre;
        this.idPassport=idPassport;
        this.nationalite=nationalite;
    } 


   

}
