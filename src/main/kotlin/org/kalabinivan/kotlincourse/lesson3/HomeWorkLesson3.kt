package org.kalabinivan.kotlincourse.lesson3

package org.kalabinivan.kotlincourse.lesson3

//Название мероприятия
const val NAME_OF_CONTEST: String = "Hackaton" // Название мы не собираемся менять

//Дата проведения
var dateOfContest: String = "9.10.2024" // дату менять тоже бы не хотелось, но вероятность присутсвует

//Место проведения
var placeOfContest: String = "DK imeni Lenina" // тут также как с датой

//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
private var budgetInDetails: String = "Большой отчёт со всеми статьями расходов"
// отчёт крупный и подробно расписанный нет смысла нагромождать его переменными в нашем случае

//Количество участников
var numOfMembers: Int = 0
    get() = field
    private set(value) {

    }// тут мне хотелось просто сделать var, но подумалось что эта переменная будет заполнена уже
// по окочанию контеста

//Длительность хакатона
val duraionOfContest: Long = 7*60*60

//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var allAboutVendors: String  // эта вещь нам может понадобиться только по запросу

//Текущее состояние хакатона (статус)
var statusOfContest: String = "Не начат"

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
private var coordInfo: String = "Большой отчёт с подробностями"

//Количество команд
var countTeams: Int = 0

//Перечень задач
val tasks: String = "Список задач"

//План эвакуации
val evacuationPlan: String = "https://cdn46.printdirect.ru/cache/product/d1/71/1256595/tov/all/500z500_front_33_0_0_0_d6de208090bcae47e7083dd4412b.jpg?rnd=1280651850"

//Список доступного оборудования
val allEquipment: String = "Список доступного оборудования"

//Список свободного оборудования
var availableEquipment: String = allEquipment

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var mealSchedule: String

//План мероприятий на случай сбоев
val eventsPlanB: String = "План мероприятий на случай сбоев" // эта вещь нам может понадобиться только по запросу

//Список экспертов и жюри
var expertsAndJury: String = "Полный список экспертов и Жюри"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val bigDoc: String by lazy {
    ""
}

//Политика конфиденциальности
const val PRIVACY_POLICY: String = "PrivacyPolicy.hackaton.org"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
val feedBackFromParticipants: String by lazy {
    "feedback.hackaton.org"
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
private var eventsLog: String = "Лог событий"
    get () = field
    set (value) {
        field = value
    }

//Доступность медицинской помощи
val medicalAid: Boolean = true

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private var safety: String = "RUN"

//Регистрационный номер мероприятия
val regNumber: Int = 387387387

//Максимально допустимый уровень шума в помещении хакатона.
const val NOISE_LEVEL: Int = 40

//Индикатор превышения уровня шума в помещениях
var noiseIndicator: Int = 40

//Формат мероприятия (зависит от геополитической обстановки)
var formatOfContest: String = "Online"

//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var places: Int = 300
    set (value) {
        if (value>=0) field = value}

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона
//автоматизированных проверок.
private var projectsTeamsInfo: String = "Детальная инфа о командных проектах"

//Статус получения всех необходимых разрешений
private var permitsStatus: Boolean = true

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
private var exclusiveAccess: Boolean = true

//Список партнеров мероприятия
var partbersOfContest: String = "Список партнёров мероприятия"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var finalReport: String

//План распределения призов
var prizesPlan: String = "План по распределению призов"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val nineOneOneContacts: String = "Все контакты служб"

//Особые условия для участников с ограниченными возможностями
var disabledPeopleConditions: String = "Условия для лдей с огр возможностями"

//Общее настроение участников (определяется опросами)
val mood: String by lazy {
    ""
}

//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед
//началом мероприятия.
lateinit var plan: String

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
lateinit var speshialGuest: String

//Максимальное количество людей, которое может вместить место проведения.
val offLimit: Double = 20.01

var maxMembers: Double = 2000.0
    get() = field
    set (value) {
        if (value <= 2000) field = value
        else field = offLimit
    }

//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val timeOff: Long = 301

var projectTime: Long = 30
    get () = field
    set(value) {
        if (value <= 30) field = value
        else field = timeOff
    }
