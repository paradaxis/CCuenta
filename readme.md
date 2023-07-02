# Pruebas de Markdown #

## Subtitulo ##
Ejemplo de trozo de código:
```
linea1
linea2
```
También podemos uar un `comando` para escribir.

**Texto en negrita** y __texto en negrita__ junto con *Texto en cursiva* y _texto en cursiva_  
~~Texto tachado~~ junto a <sub>abajo</sub> y <sup>arriba</sup>  
Me gusta el color `#FF1122` y `#FF1122` mucho `rgb(255, 22, 21)` y `hsl(212, 92%, 45%)`  
Esto es un [enlace](http://pages.github.com/).  
Esto es un [enlace](src/ccuenta/Main.java) a un documento del repositorio.  
![Imagen externa](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Duke_%28Java_mascot%29_waving.svg/140px-Duke_%28Java_mascot%29_waving.svg.png)  
![Imagen de mi repositorio](glassfish-logo.png)  
Lista desordenada:
- George Washington
* John Adams
+ Thomas Jefferson

Lista ordenada:
1. elemento1
2. elemento2
1. elemento3
***
Linea
***
Here is a simple footnote[^1].
A footnote can also have multiple lines[^2].

[^1]: My reference.
[^2]: To add line breaks within a footnote, prefix new lines with 2 spaces.
  This is a second line.

<!-- This content will not appear in the rendered Markdown -->

@Equipo1 Esto es una mención  

| Izquierda | Columna centrada | Derecha |
| :------- | :------: | -----: |
| Item 1   | 15       | 150€   |
| Item 2   | 3250     | 23,65€ |

# Coamndos GIT #
## Iniciales ##
|Comando|Función|
|----|----|
| git init | inicializa la carpeta como carpeta GIT |

## Informativos ##
|Comando|Función|
|----|----|
| git status | devuelve el estado |
| git diff x | muestra las diferencias del archivo x entre el WD y el SA |
| git diff r1 r2 | muestra las diferencias de archivos entre una rama y otra |
| git log | para ver los commits hechos |
| git log --oneline | lo mismo pero en una línea |
| git log --graph | ver ramas y sus relaciones |
| git log --decorate | muestra las ramas en la que están los commits |
| git log --all | muestra todos los commits |

## Trabajar con archivos ##
|Comando|Función|
|----|----|
| git add x | añade el archivo x del WD al SA |
| git add .	| añade todos los archivos del WD al SA |
| git checkout -- x	| revertir cambios del archivo x |
| git commit | confirma cambios del SA al RL |

## Trabajar con ramas ##
|Comando|Función|
|----|----|
| git branch | muestra las ramas |
| git checkout x | cambia a la rama de nombre x |
| git checkout -b x | crea una rama y cambia a ella |
| git branch x | crea una rama con nombre x |
| git branch -m n1 n2 | cambia el nombre del branch a n2 |
| git branch -d n1 | eliminamos n1 |

.gitignore	archivo para indicar los archivos a ignorar

## Repositorios remotos ##
|Comando|Función|
|----|----|
| git remote add origin https://github.com/miusuario/miproyecto.git | Conectar RL con GitHub |
| git push -u origin master (pedirá login) | Subir código a RR |
| git clone https://github.com/miusuario/miproyecto.git | Descargar proyecto de RR a RL |

## Fusiones ##
|Comando|Función|
|----|----|
| git merge r1 r2 | fusiona el código de r1 a r2 (hay que estar antes en r2)(fast-forward) |
| git merge r1 | (tercer commit) |
| git revert n⁰commit | deshace el comit indicado pero guarda registro en la lista de commits |
| git reset --hard n⁰commit | (el principio) resetea el código al estado indicado |
| git revert --no-commit n⁰commit | ?? |
