export default class Accordion {
    #id // id de la capa principal del accordion
  
    constructor(config) {
      // llamado al método create
      ; (async () => await this.create(config))()
    }
  
    async create(config) {
      this.#id = `accordion-${Math.random().toString(36).slice(2, 12)}`
  
  
      // Crear un array de objetos con los datos del punto 6
      const response = await fetch(config.data)
      const accordionData = await response.json()
  
      // Recorrer el array de objetos para
      let accordionHTML = ''
      for await(const item of accordionData) { //    En cada iteración recuperar el texto HTML referenciado por urlContent
        const contentResponse = await fetch(item.urlContent)
        const contentHTML = await contentResponse.text() // espera a que se resuelva la promesa y guarda el texto HTML

        accordionHTML += `
        <div id = "${this.#id}" class="accordion">
            <div class="accordion-item">
                <h2>${item.tittle}</h2>
            </div>
        </div>
        `
      }
      console.log(accordionHTML);
      
      //    Cree el HTML del pliegue actual y concaténelo a los demás pliegues
      
  
      // Agregar los pliegues a un string que represente el HTML de la capa
      //    principal del accordion
      // Insertar el accordion en el container indicado en el parámetro config.
  
      // Agregar la funcionalidad JavaScript complementaria, dada por el autor.
  
      // Si la propiedad built es una función ejecútela enviando como argumento
      //    un objeto con el ID del accordion y la data completa
    }
}