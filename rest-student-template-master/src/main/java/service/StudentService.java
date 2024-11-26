package service;

import entity.Student;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Path("students")
public class StudentService {

    private static AtomicInteger nextStudentId = new AtomicInteger(1);
    private static ConcurrentMap<Integer, Student> studentDb = new ConcurrentHashMap<>();  // kann als interne Datenbank verwendet werden

    @POST
    @Path("add")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student matriculate(Student s) {
        int id = nextStudentId.getAndIncrement();
        s.setStudentNumber(id);
        return studentDb.put(id, s);
    }

    @DELETE
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student exmatriculate(@PathParam("id") int studentId) {
        return studentDb.remove(studentId);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{id}") //GET /students/123
    public Student getStudentById(@PathParam("id") int studentId) {
        return studentDb.get(studentId);
    }

    @PUT
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Student updateStudentAccount(@PathParam("id") int studentId, Student newData) {
        return studentDb.put(studentId, newData);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("getAll")
    public Collection<Student> getAllStudents() {
        return studentDb.values();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Collection<Student> getStudentsByRange(@QueryParam("vonId") int fromStudentId, @QueryParam("bisId") int toStudentId) {
        ArrayList<Student> students = new ArrayList<>();
        for(;fromStudentId <= toStudentId; fromStudentId++) {
            students.add(studentDb.get(fromStudentId));
        }
        return students;
    }
}
