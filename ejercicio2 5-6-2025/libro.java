public class libro extends publicacion{

    protected int nro_paginas;
    protected String genero;

    public libro(String fecha_estreno, String nombre, String editorial, int precio, int nro_paginas, String genero) {
        super(fecha_estreno, nombre, editorial, precio);
        this.nro_paginas = nro_paginas;
        this.genero=genero;
    }
    
    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
