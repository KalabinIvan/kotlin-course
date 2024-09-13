package org.kalabinivan.kotlincourse.lesson3

//Название мероприятия
const val NAME_OF_CONTEST: String = "Hackaton" // Название мы не собираемся менять

//Дата проведения
var DATE_OF_CONTEST: String = "9.10.2024" // дату менять тоже бы не хотелось, но вероятность присутсвует

//Место проведения
var PLACE_OF_CONTEST: String = "DK imeni Lenina" // тут также как с датой

//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
val budgetInDetails: String by lazy {
    "Большой отчёт со всеми статьями расходов" // отчёт крупный и подробно расписанный нет смысла нагромождать его переменными в нашем случае
}

//Количество участников
lateinit var numOfParticipants: String // тут мне хотелось просто сделать var, но подумалось что эта переменная будет заполнена уже
// по окочанию контеста

//Длительность хакатона
val duraionOfContest: Int = 7 // длительность мы менять не планируем


//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val allAboutVendors: String by lazy {
    "Contacts and documentation" // эта вещь нам может понадобиться только по запросу
}

//Текущее состояние хакатона (статус)

//----

//Список спонсоров
var sponsors: String = "Shawarma u Jamala, Barbershop Boroda moya Borodka, Produkty 24/7" // список спонсоров в теории может меняться

//Бюджет мероприятия
var budget: Double = 0.0


//Текущий уровень доступа к интернету
var internet: Int = 0
    get () = field
    set (value) {
        if (value >= 0) field = value else if (value <= 5) field = value
    }
//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var coordInfo: String = "Большой отчёт с подробностями"
    get() {
        if (isAccessible()) return field
        else return "Access denied"
    }

fun isAccessible(): Boolean {

    return TODO("Provide the return value") //тут я вообще не разобрался что происходит
}

//Количество команд
var countTeams: Int = 0
    get() = field
    set(value) {
        if (value>= 0) field = value
    }

//Перечень задач
var tasks: String = "Список задач"

//План эвакуации
val evacuationPlan: String = "https://cdn46.printdirect.ru/cache/product/d1/71/1256595/tov/all/500z500_front_33_0_0_0_d6de208090bcae47e7083dd4412b.jpg?rnd=1280651850"

//Список доступного оборудования
val allEquipment: String = "Список доступного оборудования"

//Список свободного оборудования
var availableEquipment: String = "Список свободного оборудования"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var mealSchedule: String

//План мероприятий на случай сбоев
val eventsPlanB: String by lazy {
    "План мероприятий на случай сбоев" // эта вещь нам может понадобиться только по запросу
}

//Список экспертов и жюри
var expertsAndJury: String = "Полный список экспертов и Жюри"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

// ----

//Политика конфиденциальности
val privacyPolicy: String = "PrivacyPolicy.hackaton.org"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var feedBackFromParticipants: String = "feedback.hackaton.org"
    get() {
        if (isAccessible()) return field
        else return "Access denied"
    }

//Текущая температура в помещении
var temperature: Double = 28.5
    get () = field
    set (value) {
        field = value
    }

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var networkEquipmentAnalysis: String = "Отчёт о текущем состоянии сетевого оборудования"
    get () = field
    set (value) {
         field = value //очень хочется притянуть сюда переменную internet, но я вообще не понимаю как
    }

//Уровень освещения
var lightingLevel: Double = 750.0
    get () = field
    set (value) {
        field = value
    }

//Лог событий мероприятия
var eventsLog: String = "Лог событий"
    get () = field
    set (value) {
        field = value
    }

//Доступность медицинской помощи

//----

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

//----

//Регистрационный номер мероприятия
const val REG_NUMBER: Int = 387387387

//Максимально допустимый уровень шума в помещении хакатона.
const val NOISE_LEVEL: Int = 40

//Индикатор превышения уровня шума в помещениях


//Формат мероприятия (зависит от геополитической обстановки)


//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.


//План взаимодействия с прессой


//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона
//автоматизированных проверок.


//Статус получения всех необходимых разрешений


//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)


//Список партнеров мероприятия


//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.


//План распределения призов


//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.


//Особые условия для участников с ограниченными возможностями


//Общее настроение участников (определяется опросами)


//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед
//началом мероприятия.


//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.


//Максимальное количество людей, которое может вместить место проведения.


//Стандартное количество часов, отведенное каждой команде для работы над проектом.


//Текущая температура в помещении

