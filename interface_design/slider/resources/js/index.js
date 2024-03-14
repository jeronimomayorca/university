export default class Slider {

    #currentIndex = 0; // Índice actual para navegar por las imágenes.
    #autoplayInterval = null; // Referencia para el intervalo de autoplay.

    constructor(config, container, gallery, interval, visibleTitle, visibleDescription) {

        this.container = container;
        this.gallery = gallery;
        this.interval = interval;
        this.visibleTitle = visibleTitle;
        this.visibleDescription = visibleDescription;

        // Inicialización automática del slider.
        ; (async () => {
            await this.#createSlider(config);
        })();

    }

    slider = new Slider({
        container: 'body',
        gallery: './resources/data/gallery.json',
        interval: 3000,
        visibleTitle: true,
        visibleDescription: true
    })

    async #createSlider(config) {

        // Cargamos los datos de la galería desde el archivo JSON.
        const gallery = await this.#loadGalleryData('./resources/data/gallery.json');

        // Generamos el HTML para las imágenes.
        let figuresHtml = gallery.map(item =>
            `<figure>
            <img src="${item.image}" alt="${item.title}">
            <figcaption>${item.title}: ${item.description}</figcaption>
            </figure>`
        ).join('');

        // Creamos una sección y añadimos el HTML de las figuras.
        const section = document.createElement('section');
        section.innerHTML = figuresHtml;

        // Insertamos la sección en el contenedor especificado en el config.
        const container = document.querySelector(config.container);
        container.insertBefore(section, container.querySelector('nav'));
        function stopAutoplay() {
            clearInterval(autoplayInterval);
        };

    }

    async #loadGalleryData(filePath) {
        // Esta función simula la carga de datos desde un archivo JSON.
        return fetch(filePath).then(response => response.json());
    }

    let currentIndex = 0;

    document.querySelector(".prev-button").addEventListener("click", () => {
        navigate(-1);
    });

    document.querySelector(".next-button").addEventListener("click", () => {
        navigate(1);
    });

    function navigate(direction) {
        const galleryContainer = document.querySelector(".gallery-container");
        const totalImages = document.querySelectorAll(".gallery-item").length;

        currentIndex = (currentIndex + direction + totalImages) % totalImages;
        const offset = -currentIndex * 100;

        galleryContainer.style.transform = `translateX(${offset}%)`;
    }


    //START AUTOPLAY
    let autoplayInterval = null;

    function startAutoplay(interval) {
        stopAutoplay(); // Detiene cualquier autoplay anterior para evitar múltiples intervalos.
        autoplayInterval = setInterval(() => {
            navigate(1); // Navega a la siguiente imagen cada intervalo de tiempo.
        }, interval);
    }


    //STOP AUTOPLAY
    function stopAutoplay() {
        clearInterval(autoplayInterval);
    }


}
