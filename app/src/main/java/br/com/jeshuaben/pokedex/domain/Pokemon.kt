package br.com.jeshuaben.pokedex.domain

data class Pokemon (
    val imageUrl: String,
    val number: Int,
    val name: String,
    val types: List<PokemonTypes>
)

