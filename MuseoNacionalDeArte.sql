CREATE TABLE colecciones (
    id_coleccion serial PRIMARY KEY,
	descripcion TEXT
);

CREATE TABLE Epoca(
	idEpoca serial PRIMARY KEY,
	descripcion text
);

CREATE TABLE Origen(
	idOrigen serial PRIMARY KEY,
	descripcion text
);

CREATE TABLE Tipo (
	idTipo serial PRIMARY KEY,
	descripcion TEXT
);
CREATE TABLE Usuarios(
	idUsuario serial PRIMARY KEY,
	nombre VARCHAR(50),
	usuario VARCHAR(50),
	contra VARCHAR(50),
	correo VARCHAR(50)
);

CREATE TABLE artistas (
    nombre VARCHAR(100) PRIMARY KEY,
    fecha_nacimiento DATE,
    fecha_fallecimiento DATE,
    pais_origen VARCHAR(50) NOT NULL,
    epoca int,
    estilo VARCHAR(50),
    descripcion TEXT,
estatus int,
	FOREIGN KEY (epoca) references Epoca (idEpoca)
);

CREATE TABLE objeto_de_arte (
    idObraDeArte INT PRIMARY KEY,
	nombreObra VARCHAR(100),
    artista VARCHAR(100),
    id_coleccion INTEGER NOT NULL,
    fecha_creacion DATE NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT,
  	idEpoca int,
    idOrigen int,
	idTipo int,
	estatus int,
	FOREIGN KEY (id_coleccion) references colecciones (id_coleccion),
	FOREIGN KEY (idEpoca) references epoca (idEpoca),
	FOREIGN KEY (idOrigen) references Origen (idOrigen),
	FOREIGN KEY (idTipo) references Tipo (idTipo),
	FOREIGN KEY (artista) references artistas (nombre)
);

CREATE TABLE Exposiciones (
	idExposicion serial PRIMARY KEY,
    nombre VARCHAR(100),
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
	estatus int
);
CREATE TABLE ExposicionObjeto(
	idExposicion int,
	idObraDeArte int,
	FOREIGN KEY (idExposicion) references Exposiciones (idExposicion),
	FOREIGN KEY (idObraDeArte) references objeto_de_arte (idObraDeArte)
);


CREATE TABLE pintura (
	idObraDeArte int,
    tipo_pintura VARCHAR(50),
    material VARCHAR(50),
    estilo VARCHAR(50),
estatus int,
	FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE escultura (
	idObraDeArte int,
    material VARCHAR(50),
    altura INT,
    peso INT,
    estilo VARCHAR(50),
estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE estatuas (
	idObraDeArte int,
    altura INT,
    peso INT,
    representacion VARCHAR(50),
estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE otros (
	idObraDeArte int,
    tipo VARCHAR(50),
    estilo VARCHAR(50),
	estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE coleccion_permanente (
    idObraDeArte INTEGER ,
    fecha_adquisicion DATE,
    estado VARCHAR(50),
    costo INTEGER,
estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE prestados (
    idObraDeArte INTEGER,
    prestamista VARCHAR(50),
    fecha_inicio DATE,
    fecha_fin DATE,
estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);

CREATE TABLE otras_colecciones (
    idObraDeArte INTEGER,
    nombre_coleccion VARCHAR(50),
    tipoColeccion VARCHAR(50),
    descripcion TEXT,
    direccion VARCHAR(100),
    telefono VARCHAR(20),
    nombre_contacto VARCHAR(50),
estatus int,
    FOREIGN KEY (idObraDeArte) REFERENCES objeto_de_arte(idObraDeArte)
);