package com.kotlinplayground

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("course is $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(1, " Reactive programming", "dilip")
    }

    override fun save(course: Course): Int{
        isCoursePersisted = true
        return  super.save(course)
    }
    override fun getAll(): Any {
        TODO("Not yet implemented")
    }
}

class NoSqlCourseRepositoryImpl : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(2, " Reactive programming", "dilip")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepositoryImpl")
        return super.save(course)
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class Ab : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("AB")
    }

}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("course is $course")
    val id = sqlCourseRepository.save(Course(5, " Reactive programming", "dilip"))
    println("${sqlCourseRepository.isCoursePersisted}")
    println("saved course id $id")
    val noSqlCourseRepositoryImpl = NoSqlCourseRepositoryImpl()

    val ab = Ab()
    ab.doSomething()
}