package com.examples.school.app.swing;

import java.awt.EventQueue;

import com.examples.school.controller.SchoolController;
import com.examples.school.repository.mongo.StudentMongoRepository;
import com.examples.school.view.swing.StudentSwingView;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class SchoolSwingApp {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					String mongoHost = "localhost";
					int mongoPort = 27017;
					if (args.length > 0)
						mongoHost = args[0];
					if (args.length > 1)
						mongoPort = Integer.parseInt(args[1]);
					MongoClient mongoClient = new MongoClient(new ServerAddress(mongoHost, mongoPort));
					StudentMongoRepository studentRepository = new StudentMongoRepository(mongoClient);
					StudentSwingView studentView = new StudentSwingView();
					SchoolController schoolController = new SchoolController(studentView, studentRepository);
					studentView.setSchoolController(schoolController);
					studentView.setVisible(true);
					schoolController.allStudents();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
