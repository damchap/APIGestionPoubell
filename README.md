

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/github_username/repo_name">
    <img src="https://atomrace.com/blog/wp-content/uploads/2018/05/spring-boot-logo.png" alt="Logo" height="80">
  </a>

<h3 align="center">TP API Spring Boot with Hybernate</h3>
<p align="center">
<table>
    <tbody>
        <td align="center">
            <img width="800" height="0" /><br>
            <i>Status:</i> Early Access</b> <br>
            <sup> Please report any issues 🐛</sup><br>
            <sub>Made possible by my <a href="https://github.com/sponsors/damchap">Sponsor Program 💖</a>
            <img width="800" height="0" /><br>
</td>
    </tbody>
</table>
</p>
  <p align="center">
    <a href="https://github.com/github_username/repo_name">View Demo</a>
    ·
    <a href="https://github.com/github_username/repo_name/issues">Report Bug</a>
    ·
    <a href="https://github.com/github_username/repo_name/issues">Request Feature</a>
  </p>
</div>


<!-- ABOUT THE PROJECT -->
## About The Project

### Project context

Build an API of your choice with the spring boot framework and hibernate
1. Choose a concept about a soccer club, a city or other things, do not take the example made in class.
2. A mini API with three controllers, Ex: (Student, School, Classroom).
3. The CRUD method (Create, Retrieve, Update, Delete, List) for each controller.
4. A relationship between at least two tables (for example between Student and School as seen in the
   during the course) with the annotation @OneToMany.
5. A relationship between at least two tables, see @oneToOne, @ManyToMany in
   optional bonus points. Example of a tutorial that explains it well.
6. The model diagram of your database as the example in the course.


<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.


<!-- CONTACT -->
## Contact

Your Name - [@twitter_handle](https://twitter.com/twitter_handle) - email@email_client.com

Project Link: [https://github.com/github_username/repo_name](https://github.com/github_username/repo_name)




<!-- ACKNOWLEDGMENTS -->
## Model Diagrams
```classDiagram
direction BT
class Facture {
  + Facture() 
  + Facture(int, int, int, String, String) 
  + Facture(int, int, String, String) 
  - int idFacture
  - int anF
  - int moisF
  - String nomFacture
  - String idHabitation
}
class Habitation {
  + Habitation(String, String, String, String, int, Usager) 
  + Habitation() 
  - String idHabitation
  - Usager usager
  - String adrRueHab
  - String cpHab
  - List~Facture~ lesFactures
  - List~Poubelle~ lesPoubelles
  - String adrVilleHab
  - int nbPersonne
}
class Levee {
  + Levee() 
  + Levee(int, Date, double, String) 
  + Levee(Date, double, String, String, String) 
  - int idLevee
  - Date laDate
  - String idPoubelle
  - double poids
}
class Poubelle {
  + Poubelle(String, String, TypeDechet) 
  + Poubelle() 
  - String idHabitation
  - String idPoubelle
  - TypeDechet nature
  - List~Levee~ lesLevees
}
class TypeDechet {
  + TypeDechet(String, String, double) 
  + TypeDechet() 
  - String libelle
  - String idTypeDechet
  - double tarif
}
class Usager {
  + Usager(String, String, String, String, String, String) 
  + Usager() 
  - String adrRueUsager
  - List~Habitation~ lesHabitations
  - String cpUsager
  - String adrVilleUsager
  - String mdp
  - String idUsager
  - String prenom
  - String login
  - String nom
}

Habitation "1" *--> "lesFactures *" Facture 
Habitation "1" *--> "lesPoubelles *" Poubelle 
Habitation "1" *--> "usager 1" Usager 
Poubelle "1" *--> "lesLevees *" Levee 
Poubelle "1" *--> "nature 1" TypeDechet 
Usager "1" *--> "lesHabitations *" Habitation 


```


