---
<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=2196F3&text=SQL&reversal=false&fontColor=FFFF&fontAlign=48&fontAlignY=39&fontSize=84&animation=fadeIn">
</div>
<div width="100%">
  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&width=1000&lines=ES%3A+El+siguiente+c%C3%B3digo+SQL+es+por+si+el+usuario+desea+hacer+una+Base+de+Datos+;propia+o+tuvo+fallas+con+la+exportada." alt="Typing SVG" /></a>
</div>
<div width="100%">
  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&pause=1000&width=1000&lines=EN%3A+The+following+SQL+code+is+for+if+the+user+wants+to+make+a+database;of+his+own+or+had+failures+with+the+exported+database" alt="Typing SVG" /></a>
</div>

---

>[!IMPORTANT] 
> ## Creamos la tabla para empleados / Create employees table
> <code>CREATE TABLE EMPLEADO (
>    IDEMPLEADO VARCHAR(8) PRIMARY KEY NOT NULL,
>    APELLIDOS VARCHAR(30) NOT NULL,
>    NOMBRES VARCHAR(30) NOT NULL,
>    F_NAC DATE NOT NULL,
>    DNI VARCHAR(8) NOT NULL,
>    DIRECCION VARCHAR(100) NOT NULL,
>    TELF VARCHAR (11),
>    CORREO_E VARCHAR(50),
>    USUARIO VARCHAR(30),
>    CONTRASEÑA VARCHAR(8)
> ); </code>
> ## Creamos tabla para clientes / Create customer table
> <code>CREATE TABLE CLIENTE (`
>    IDCLIENTE VARCHAR(8) PRIMARY KEY NOT NULL,
>    APELLIDOS VARCHAR(30) NOT NULL,
>    NOMBRES VARCHAR(30) NOT NULL,
>    F_NAC DATE NOT NULL,
>    DNI VARCHAR(8) NOT NULL,
>    CONTRASEÑA VARCHAR(8),
>    DIRECCION VARCHAR(100) NOT NULL,
>    TELF VARCHAR (11),
>    CORREO_E VARCHAR(50) NOT NULL,
>    IDEMPLEADO VARCHAR(8),
>    CONSTRAINT FK_EMPLEADO_CLIENTE FOREIGN KEY (IDEMPLEADO) REFERENCES EMPLEADO (IDEMPLEADO) ON DELETE SET NULL -- La relacion debe estar como SET NULL para poder eliminar filas 
> );</code>
> ## Creamos tabla cuenta / Create account table
> <code>CREATE TABLE CUENTA (
>    IDCUENTA VARCHAR(8) PRIMARY KEY NOT NULL,
>    TIPOCUENTA VARCHAR(20),
>    numcuenta VARCHAR(15),
>    SALDO NUMBER(10, 2) NOT NULL,
>    F_APER DATE NOT NULL,
>    ESTADO VARCHAR(30),
>    IDCLIENTE VARCHAR(8),
>    CONSTRAINT FK_CLIENTE_CUENTA FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTE (IDCLIENTE) ON DELETE SET NULL -- La relacion debe estar como SET NULL para poder eliminar filas 
> );</code>
> ## Creamos tabla transaccion / Create transaction table
> <code>CREATE TABLE TRANSACCION (
>    IDTRANSACCION VARCHAR(8) PRIMARY KEY NOT NULL,
>    F_TRA DATE NOT NULL,
>    MONTO NUMBER(10, 2) NOT NULL,
>    TIPO VARCHAR(30) NOT NULL,
>    IDCUENTA VARCHAR(8),
>    CONSTRAINT FK_CUENTA_TRANSACCION FOREIGN KEY (IDCUENTA) REFERENCES CUENTA (IDCUENTA) ON DELETE SET NULL -- La relacion debe estar como SET NULL para poder eliminar filas 
> );</code> 
> ## Insertar un empleado al azar para poder logearse e iniciar con el sistema. / Insert an employee to log in to the system
> ### Entre las comillas simples puede ingresar los valores que desee, solo son para poder acceder al sistema xd / Between the single quotation marks you can enter the values you want, they are only for accessing the system xd
> INSERT INTO empleado(idempleado, apellidos, nombres, f_nac, dni, direccion, telf, correo_e, usuario, contraseña) 
> VALUES ('','','', TO_DATE('', 'YYYY-MM-DD'),'','','','','',''); </code>
