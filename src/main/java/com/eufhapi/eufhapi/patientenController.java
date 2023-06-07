package com.eufhapi.eufhapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.eufhapi.eufhapi.Classes.Patient;
import com.eufhapi.eufhapi.Classes.PrefrentialContactApproach;

@RestController
public class patientenController {

        public patientenController() {
                try {

                        Data = new ArrayList<>(Arrays.asList(
                                        new Patient(
                                                        1,
                                                        "Margaritta",
                                                        "Frievü",
                                                        LocalDate.of(1932, 5, 25),
                                                        "w",
                                                        "Lehmbergstra√üe",
                                                        "140",
                                                        "23738",
                                                        "Beschendorf",
                                                        "04363/38914683",
                                                        "margaritta-friess@justmail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(1932, 5, 25)),
                                        new Patient(
                                                        30,
                                                        "Ehrentrudis",
                                                        "Stier",
                                                        LocalDate.of(2005, 1, 4),
                                                        "w",
                                                        "Maiweiderstraße",
                                                        "63",
                                                        "68723",
                                                        "Plankstadt",
                                                        "06202/23240121",
                                                        "e05@ultramail.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        2,
                                                        "Dittmar",
                                                        "Dittmar",
                                                        LocalDate.of(1977, 1, 23),
                                                        "m",
                                                        "Johanna-Neuman-Straße",
                                                        "179",
                                                        "63699",
                                                        "63699",
                                                        "06049/55358156",
                                                        "d-1977@anymail.none",
                                                        PrefrentialContactApproach.SMS,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        3,
                                                        "Meinard",
                                                        "Weidauer",
                                                        LocalDate.of(1970, 8, 31),
                                                        "m",
                                                        "Jakobsberger Weg",
                                                        "11b",
                                                        "63939",
                                                        "Woerth am Main",
                                                        "09372/33107814",
                                                        "m_weidauer@mymail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        4,
                                                        "Reny",
                                                        "Mester",
                                                        LocalDate.of(1993, 8, 24),
                                                        "w",
                                                        "Gescherweg",
                                                        "33",
                                                        "97502",
                                                        "Euerbach",
                                                        "09726/20008970",
                                                        "renymester@inter-mail.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        5,
                                                        "Birgitt",
                                                        "Solbach",
                                                        LocalDate.of(1951, 9, 5),
                                                        "d",
                                                        "Schuetzstrasse",
                                                        "108",
                                                        "46539",
                                                        "Dinslaken",
                                                        "02064/7031032",
                                                        "b_solbach@net-mail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        6,
                                                        "Caroline",
                                                        "Paris",
                                                        LocalDate.of(1980, 7, 17),
                                                        "w",
                                                        "Kuhberg",
                                                        "185",
                                                        "79793",
                                                        "Wutschingen",
                                                        "07746/87577835",
                                                        "caroline.paris@mymail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        7,
                                                        "Mariedore",
                                                        "Hendrich",
                                                        LocalDate.of(2005, 2, 4),
                                                        "w",
                                                        "Dietrich-Bonhoeffer-Straße",
                                                        "183",
                                                        "75056",
                                                        "Sulzfeld",
                                                        "07269/85994806",
                                                        "mariedorehendrich@anymail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        8,
                                                        "Gerta",
                                                        "Heiss",
                                                        LocalDate.of(2005, 1, 4),
                                                        "w",
                                                        "Biskirchener Straße",
                                                        "108",
                                                        "38462",
                                                        "Grafhorst",
                                                        "05364/96846293",
                                                        "hsparks@email.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        9,
                                                        "Irmhilde",
                                                        "Jost",
                                                        LocalDate.of(2005, 1, 4),
                                                        "w",
                                                        "Grunewald",
                                                        "62",
                                                        "55497",
                                                        "Ellern",
                                                        "06764/93396901",
                                                        "urthe-boerner@company.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        10,
                                                        "Bernhild",
                                                        "Wappler",
                                                        LocalDate.of(2005, 1, 4),
                                                        "m",
                                                        "Nebeliner Straße",
                                                        "120",
                                                        "42109",
                                                        "Wuppertal",
                                                        "0202/77298057",
                                                        "bernhild.wappler@trashmail.none",
                                                        PrefrentialContactApproach.SMS,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        11,
                                                        "Heidrun",
                                                        "Sparks",
                                                        LocalDate.of(1977, 1, 28),
                                                        "w",
                                                        "Wackenbrucher Straße",
                                                        "183",
                                                        "75056",
                                                        "Sulzfeld",
                                                        "07269/85994806",
                                                        "mariedorehendrich@anymail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        12,
                                                        "Uthe",
                                                        "Börner",
                                                        LocalDate.of(1951, 9, 15),
                                                        "w",
                                                        "Dietrich-Bonhoeffer-Straßüe",
                                                        "10",
                                                        "4316",
                                                        "Mölkau",
                                                        "0341/82080913",
                                                        "g-1951@company.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        13,
                                                        "Katharina",
                                                        "Steckel",
                                                        LocalDate.of(1963, 11, 11),
                                                        "w",
                                                        "Moritzstraße",
                                                        "32",
                                                        "3212",
                                                        "Münster",
                                                        "34234/24452",
                                                        "Testmail@infomail.com",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        14,
                                                        "Bärbel",
                                                        "Richards",
                                                        LocalDate.of(2016, 6, 25),
                                                        "w",
                                                        "Danziger Straße",
                                                        "12d",
                                                        "16227",
                                                        "Eberswalde",
                                                        "03334/16715701",
                                                        "katharinasteckel@web.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        15,
                                                        "Wolfdieter",
                                                        "Welke",
                                                        LocalDate.of(1946, 1, 12),
                                                        "m",
                                                        "Alter Markt",
                                                        "45",
                                                        "27259",
                                                        "Wehrbleck",
                                                        "04273/53659607",
                                                        "b-richards@hoster.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        16,
                                                        "Gritta",
                                                        "Kowalewski",
                                                        LocalDate.of(1999, 8, 27),
                                                        "w",
                                                        "Memellandstra√üe",
                                                        "12a",
                                                        "93073",
                                                        "Neutraubling",
                                                        "09401/9362700",
                                                        "w2020@open-mail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        17,
                                                        "Horst",
                                                        "Overbeck",
                                                        LocalDate.of(2004, 4, 14),
                                                        "m",
                                                        "Graudenzer Stra√üe",
                                                        "98",
                                                        "20357",
                                                        "Hamburg",
                                                        "040/31267324",
                                                        "gkowalewski@goggle-mail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        18,
                                                        "Claudia",
                                                        "Lust",
                                                        LocalDate.of(1987, 11, 30),
                                                        "w",
                                                        "Winternam",
                                                        "67",
                                                        "57636",
                                                        "Mammelzen",
                                                        "02681/62059689",
                                                        "horst.overbeck@goggle-mail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        19,
                                                        "Hasso",
                                                        "Löchel",
                                                        LocalDate.of(1920, 12, 24),
                                                        "m",
                                                        "Himmelohstraße",
                                                        "1",
                                                        "97780",
                                                        "Gössenheim",
                                                        "09358/5627996",
                                                        "claudia-60@mymail.none",
                                                        PrefrentialContactApproach.SMS,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        20,
                                                        "Ilsedore",
                                                        "Kirschbaum",
                                                        LocalDate.of(1945, 10, 1),
                                                        "d",
                                                        "Wangener Straße",
                                                        "763",
                                                        "57520",
                                                        "Schutzbach",
                                                        "02743/48607263",
                                                        "hasso_loechel@live-mail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        21,
                                                        "Aslind",
                                                        "Grau",
                                                        LocalDate.of(2008, 1, 1),
                                                        "w",
                                                        "Hörder Straße",
                                                        "122",
                                                        "96176",
                                                        "Pfarrweisach",
                                                        "09535/97124471",
                                                        "ilsedore_kirschbaum@validmail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        23,
                                                        "Burckhardt",
                                                        "Daniel",
                                                        LocalDate.of(2000, 3, 31),
                                                        "m",
                                                        "Bügermeisterstraße",
                                                        "44",
                                                        "84056",
                                                        "Rottenburg an der Laaber",
                                                        "08781/37387812",
                                                        "agrau@mymail.none",
                                                        PrefrentialContactApproach.TELEPHONE,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        22,
                                                        "Klemens",
                                                        "Gerst",
                                                        LocalDate.of(2000, 2, 2),
                                                        "m",
                                                        "Segbachstraße",
                                                        "21",
                                                        "57627",
                                                        "Hachenburg",
                                                        "02662/72423667",
                                                        "burckhardtdaniel@xyz.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        24,
                                                        "Desiree",
                                                        "Dietzsch",
                                                        LocalDate.of(1991, 2, 6),
                                                        "w",
                                                        "In den Weingärten",
                                                        "55",
                                                        "54608",
                                                        "Bleialf",
                                                        "06555/32114037",
                                                        "klemensgerst@kitty.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        25,
                                                        "Helga",
                                                        "Reutter",
                                                        LocalDate.of(1999, 2, 28),
                                                        "w",
                                                        "Grafenstraße",
                                                        "21",
                                                        "24594",
                                                        "Meezen",
                                                        "04871/99581506",
                                                        "ddietzsch@spam-mail.none",
                                                        PrefrentialContactApproach.LETTER,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        26,
                                                        "Nelly",
                                                        "Roßübach",
                                                        LocalDate.of(2022, 9, 1),
                                                        "w",
                                                        "Dernbacher Straße",
                                                        "12",
                                                        "54552",
                                                        "Nerdlen",
                                                        "06592/58764898",
                                                        "helga.reutter@justmail.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        27,
                                                        "Hanshelmut",
                                                        "Heid",
                                                        LocalDate.of(1964, 6, 26),
                                                        "m",
                                                        "Brunnenwiesenweg",
                                                        "76d",
                                                        "52385",
                                                        "Nideggen",
                                                        "02427/70887211",
                                                        "n_52@web.none",
                                                        PrefrentialContactApproach.EMAIL,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        28,
                                                        "Annie",
                                                        "Montgomery",
                                                        LocalDate.of(1985, 3, 13),
                                                        "w",
                                                        "Schauinslandstraße",
                                                        "2",
                                                        "57629",
                                                        "Hauroth",
                                                        "02653/75436486",
                                                        "a_montgomery@trashmail.none",
                                                        PrefrentialContactApproach.SMS,
                                                        LocalDate.of(2005, 1, 4)),
                                        new Patient(
                                                        29,
                                                        "Sieglind",
                                                        "Rutkowski",
                                                        LocalDate.of(2000, 12, 2),
                                                        "w",
                                                        "Schlick",
                                                        "195c",
                                                        "77815",
                                                        "Brühl",
                                                        "07223/33343604",
                                                        "sieglind_1977@inter-mail.none",
                                                        PrefrentialContactApproach.SMS,
                                                        LocalDate.of(2005, 1, 4))));

                } catch (Exception e) {

                }
        }

        /*
         * Get - Laden von Informationen
         * Post - Speichern von Informationen
         * Put - Speichern von Informationen
         * Delete - Löschen von Informationen
         * Patch - Aktualisieren von Informationen
         */

        /*
         * @GetMapping("/Patienten")
         * public List<Patient> GetAllPatienten() {
         * try {
         * List<Patient> allPatients = new ArrayList<>(Data.size());
         * 
         * for (int i = 0; i < Data.size(); ++i) {
         * Patient currentPatient = Data.get(i);
         * allPatients.add(new Patient(currentPatient.getId(),
         * currentPatient.getFirstName(),
         * currentPatient.getLastName()));
         * }
         * return allPatients;
         * } catch (Exception e) {
         * return null;
         * }
         * }
         */

        @GetMapping("/Patienten")
        public List<Patient> GetAllPatienten() {
                try {
                        List<Patient> allPatients = new ArrayList<>(Data);

                        return allPatients;
                } catch (Exception e) {
                        return null;
                }
        }

        @DeleteMapping("/Patienten/{id}")
        public ResponseEntity<Long> DeletePatientById(@PathVariable int id) {

                for (int i = 0; i < Data.size(); ++i) {
                        Patient currentPatient = Data.get(i);
                        if (currentPatient.getId() == id) {

                                Data.remove(i);
                                return new ResponseEntity<Long>(HttpStatus.OK);
                        }
                }
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient nicht gefunden");
        }

        private List<Patient> Data;
}
