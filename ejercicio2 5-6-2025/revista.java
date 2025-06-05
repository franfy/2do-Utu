public class revista extends publicacion{

    protected int nro_paginas;
    protected int cant_comics;
    protected String noticias;
    
    public revista(String fecha_estreno, String nombre, String escritor, int precio, int nro_paginas, int cant_comics, String noticias) {
        super(fecha_estreno, nombre, escritor, precio);
        this.nro_paginas = nro_paginas;
        this.cant_comics = cant_comics;
        this.noticias = noticias;
    }

    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public int getCant_comics() {
        return cant_comics;
    }

    public void setCant_comics(int cant_comics) {
        this.cant_comics = cant_comics;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    

}
