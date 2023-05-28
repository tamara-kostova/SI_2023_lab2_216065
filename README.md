# Tamara Kostova 216065

![image](https://github.com/tamara-kostova/SI_2023_lab2_216065/assets/90916955/adb698ef-aa59-4289-8a33-91bba2688b38)

3. Ciklomatska slozenost:

rebra - jazli + 2 = 31 - 22 + 2 = 11 / predikati + 1 = 10 + 1 = 11

4. Every Branch

| C0 | user=null | username = null, email=”user”, password=”user” | username = “user”, email=user@mail.com, password=”qwertyuio*”, users={"user","user2"} | username = “user”, email=user@mail.com, password=”qwer tyuio*”, users={"user1","user2"} |
| ---- | --- | --- | --- | --- |
| A-B | * |  |  |  |
| B-W | * |  |  |  |
| A-C |  | * | * | * |
| C-D |  | * |  |  |
| C-E,F |  |  | * | * |
| D-E,F |  | * |  |  |
| E,F-N,O |  | * |  |  |
| E,F-G,H.1 |  |  | * | * |
| G,H.1-H.2 |  |  | * | * |
| H.2-I,J |  |  | * | * |
| H.2-N,O |  |  | * | * |
| I,J-K |  |  | * |  |
| I,J-L |  |  |  | * |
| K-L |  |  | * |  |
| L-M |  |  | * |  |
| L-H.3 |  |  |  | * |
| M-H.3 |  |  | * |  |
| H.3-H.2 |  |  | * | * |
| N,O-P |  | * |  |  |
| N,O-Q,R |  | * | * | * |
| P-W |  | * |  |  |
| Q,R-S1 |  |  | * |  |
| Q,R-V |  |  |  | * |
| V-W |  |  |  | * |
| S1-S2 |  |  | * |  |
| S2-V |  |  |  |  |
| S2-T |  |  | * |  |
| T-U |  |  | * |  |
| T-S3 |  |  | * |  |
| S3-S2 |  |  | * |  |
| U-W |  |  | * |  |

-Ni treba test slucaj koj odi po levata strana na grafot odnosno vleguva vo jazol B izavrsuva - toa e tocno koga user=null

-Ponatamu dokolku user!=null, no usernameot=null, treba da mu se dodeli username (C-D) i imame slucaj koga passwordot ne e vo red, pa se odi po patekata N,O-P-W

-Ni treba slucaj koga passwordot e vo red i se vleguva vo dvata for ciklusa, no ne i vo uslovite J i L (granki J-K i L-M)

-Slucaj koga passwordot e vo red i se vleguva vo prviot for ciklus i vo uslovite J i L (granki J-K i L-M), no so uslovot R se skoka do V i W

5. Multiple Condition

| user == null | user.getPassword() == null | user.getEmail() == null | output |
| --- | --- | --- | --- |
| T | X | X | T |
| F | T | X | T |
| F | F | T | T |
| F | F | F | F |

-Dokolku user = null, uslovot vednas ke vrati True i ke se vleze vo if-ot, nema voopsto da se razgledaat ostanatite 2 uslovi

-Dokolku user!=null, ke se prover user.getPassword() i dokolku toa e null, uslovot ke vrati True i ke se vleze vo if-ot

-Dokolku user!=null i user.getPassword!=null ke se proveri tretiot uslov user.getEmail() i dokolku e null, uslovot ke vrati True i ke se vleze vo if-ot

-Samo vo slucaj koga site tri uslovi se false, nema da se vleze vo if-ot 
