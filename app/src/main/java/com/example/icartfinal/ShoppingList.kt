package com.example.icartfinal

//Class to show products and category
class ShoppingList() {

    companion object {
        val frutas = Category( //List of fruits
            "Frutas", arrayOf(
                Product("Manzanas"),
                Product("Naranjas"),
                Product("Peras"),
                Product("Plátanos"),
                Product("Mandarinas"),
                Product("Kiwis"),
                Product("Melocotones"),
                Product("Granadas"),
            )
        )

        val verduras = Category( //List of type of vegetables
            "Vegetales", arrayOf(
                Product("Lechuga"),
                Product("Cebolla"),
                Product("Puerro"),
                Product("Pimiento rojo"),
                Product("Pimiento verde"),
                Product("Tomate"),
                Product("Pepino"),
                Product("Calabacín"),
                Product("Berenjena"),
                Product("Espinacas"),
            )
        )

        val ternera = Category( //List of type of meat veal
            "Ternera", arrayOf(
                Product("Filete de ternera"),
                Product("Solomillo de ternera"),
                Product("Entrecot"),
            )
        )

        val pollo = Category( //List of type of meat chicken
            "Pollo", arrayOf(
                Product("Pechuga"),
                Product("Muslos"),
                Product("Contramuslos"),
                Product("Alitas"),
                Product("Carcasas"),
            )
        )

        val cerdo = Category( //List of type of meat pig
            "Cerdo", arrayOf(
                Product("Solomillo de cerdo"),
                Product("Cinta de lomo"),
                Product("Cinta de lomo adobada"),
            )
        )

        val lacteos = Category( //List of type of dairy products
            "Lácteos", arrayOf(
                Product("Leche entera"),
                Product("Leche semi"),
                Product("Leche desnatada"),
                Product("Natillas"),
                Product("Mantequilla"),
                Product("Yogures fresa"),
                Product("Yogures limón"),
                Product("Yogures plátano"),
                Product("Yogures variados")
            )
        )

        val queso = Category( //List of type of cheese
            "Quesos", arrayOf(
                Product("Oveja viejo"),
                Product("Oveja curado"),
                Product("Mezcla"),
                Product("Emmental"),
                Product("Roquefort"),
                Product("Queso azul"),
            )
        )

        val pasta = Category( //List of type of pasta
            "Pasta", arrayOf(
                Product("Macarrones"),
                Product("Espaguetis"),
                Product("Raviolis"),
                Product("Espirales"),
                Product("Tortelinis"),
            )
        )

        val fiambre = Category( //List of type of stiff
            "Fiambre", arrayOf(
                Product("Chorizo"),
                Product("Salchichón"),
                Product("Pavo"),
                Product("Jamón York"),
                Product("Fuet"),
            )
        )

        val zumos = Category( //List of type of juice
            "Zumos", arrayOf(
                Product("Zumo de melocotón"),
                Product("Zumo de naranja"),
                Product("Zumo de piña"),
                Product("Zumo multifrutas"),
            )
        )

        val bano = Category( //List of bath products
            "Baño", arrayOf(
                Product("Gel de baño"),
                Product("Champú"),
                Product("Jabón de manos"),
                Product("Papel higiénico"),
            )
        )

        val limpieza = Category( //List of cleaner products
            "Limpieza", arrayOf(
                Product("Lejía"),
                Product("Fregona"),
                Product("Bayeta"),
                Product("Estropajo"),
                Product("Jabón lavadora"),
                Product("Suavizante"),
            )
        )


        val listadoCategorias = arrayOf<Category>(
            frutas,
            verduras,
            ternera,
            pollo,
            cerdo,
            lacteos,
            queso,
            pasta,
            fiambre,
            zumos,
            bano,
            limpieza
        )
        var listaCompra = ArrayList<String>()
        //Add product to list
        fun addToList(elem: String) : Boolean {
            if (!this.listaCompra.contains(elem)) {
                this.listaCompra.add(elem)
                return true
            }
            else{
                return false
            }
        }

    }
}