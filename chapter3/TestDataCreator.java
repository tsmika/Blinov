package chapter3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestDataCreator {
	public static Entity[] createData(EntityType entityType) {
		Entity data[] = new Entity[30];

		switch (entityType) {
		case STUDENT:
			data = createStudentArray();
			break;
		default:
			return null; // (TODO create Exception)
		}

		return data;
	}

	private static Student[] createStudentArray() {
		String idData = "{\"id\": [11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]}";
		String nameData = "{\"name\": [\"James Wilson\", \"Mary Brown\", \"John Davis\", \"Patricia Miller\", \"Robert Moore\", \"Jennifer Taylor\", \"Michael Anderson\", \"Linda Thomas\", \"William Jackson\", \"Elizabeth White\", \"David Harris\", \"Barbara Martin\", \"Joseph Thompson\", \"Susan Garcia\", \"Charles Martinez\", \"Jessica Robinson\", \"Thomas Clark\", \"Sarah Rodriguez\", \"Christopher Lewis\", \"Karen Lee\", \"Daniel Walker\", \"Lisa Hall\", \"Matthew Allen\", \"Nancy Young\", \"Anthony King\", \"Margaret Wright\", \"Donald Scott\", \"Betty Green\", \"Mark Adams\", \"Dorothy Baker\"]}";
		String dateOfBirthData = "{\"dateOfBirth\": [\"2004-03-15\", \"2004-07-22\", \"2004-11-05\", \"2005-01-18\", \"2005-04-30\", \"2005-08-12\", \"2005-10-25\", \"2006-02-14\", \"2006-05-07\", \"2006-09-19\", \"2006-12-03\", \"2007-03-27\", \"2007-06-10\", \"2007-08-29\", \"2007-11-14\", \"2008-01-09\", \"2008-02-20\", \"2008-04-05\", \"2008-05-18\", \"2008-06-30\", \"2004-09-08\", \"2005-12-17\", \"2006-01-23\", \"2006-07-11\", \"2007-04-03\", \"2007-09-16\", \"2008-03-02\", \"2008-07-24\", \"2008-10-11\", \"2008-12-25\"]}";
		String addressData = "{\"address\": [\"123 Main St, New York, NY 10001\", \"456 Oak Avenue, Los Angeles, CA 90001\", \"789 Pine Road, Chicago, IL 60601\", \"321 Elm Street, Houston, TX 77001\", \"654 Maple Drive, Phoenix, AZ 85001\", \"987 Cedar Lane, Philadelphia, PA 19101\", \"147 Washington Blvd, San Antonio, TX 78201\", \"258 Jefferson Ave, San Diego, CA 92101\", \"369 Madison Street, Dallas, TX 75201\", \"741 Lincoln Way, San Jose, CA 95101\", \"852 Adams Road, Austin, TX 78701\", \"963 Jackson Drive, Jacksonville, FL 32201\", \"159 Franklin Street, Fort Worth, TX 76101\", \"753 Harrison Ave, Columbus, OH 43201\", \"852 Gibson Lane, Charlotte, NC 28201\", \"951 Hamilton Road, Detroit, MI 48201\", \"357 Irving Street, El Paso, TX 79901\", \"456 Johnson Blvd, Memphis, TN 38101\", \"789 Kennedy Drive, Boston, MA 02101\", \"123 Morgan Street, Seattle, WA 98101\", \"456 Nelson Ave, Denver, CO 80201\", \"789 Oliver Road, Washington, DC 20001\", \"321 Parker Lane, Nashville, TN 37201\", \"654 Quincy Street, Baltimore, MD 21201\", \"987 Robinson Drive, Louisville, KY 40201\", \"147 Willow Street, Portland, OR 97201\", \"258 Birch Avenue, Milwaukee, WI 53201\", \"369 Spruce Lane, Albuquerque, NM 87101\", \"741 Cedar Road, Tucson, AZ 85701\", \"852 Maple Street, Fresno, CA 93701\"]}";
		String phoneData = "{\"phone\": [\"+1-212-555-0101\", \"+1-310-555-0202\", \"+1-312-555-0303\", \"+1-713-555-0404\", \"+1-602-555-0505\", \"+1-215-555-0606\", \"+1-210-555-0707\", \"+1-619-555-0808\", \"+1-214-555-0909\", \"+1-408-555-1010\", \"+1-512-555-1111\", \"+1-904-555-1212\", \"+1-817-555-1313\", \"+1-614-555-1414\", \"+1-704-555-1515\", \"+1-313-555-1616\", \"+1-915-555-1717\", \"+1-901-555-1818\", \"+1-617-555-1919\", \"+1-206-555-2020\", \"+1-303-555-2121\", \"+1-202-555-2222\", \"+1-615-555-2323\", \"+1-410-555-2424\", \"+1-502-555-2525\", \"+1-503-555-2626\", \"+1-404-555-2727\", \"+1-305-555-2828\", \"+1-702-555-2929\", \"+1-505-555-3030\"]}";
		String departmentData = "{\"department\": [\"Computer Science\", \"Electrical Engineering\", \"Mechanical Engineering\", \"Electrical Engineering\", \"Mechanical Engineering\", \"Mathematics\", \"Mathematics\", \"Mathematics\", \"Mechanical Engineering\", \"Electrical Engineering\", \"Mechanical Engineering\", \"Electrical Engineering\", \"Mechanical Engineering\", \"Electrical Engineering\", \"Mathematics\", \"Mathematics\", \"Computer Science\", \"Chemical Engineering\", \"Computer Science\", \"Chemical Engineering\", \"Chemical Engineering\", \"Computer Science\", \"Chemical Engineering\", \"Computer Science\", \"Chemical Engineering\", \"Computer Science\", \"Computer Science\", \"Computer Science\", \"Computer Science\", \"Computer Science\"]}";
		String studyYearData = "{\"studyYear\": [1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 1, 2, 3, 4, 5]}";
		String groupNumberData = "{\"groupNumber\": [5, 5, 2, 1, 5, 6, 7, 2, 2, 3, 1, 8, 6, 1, 4, 3, 6, 7, 8, 7, 3, 4, 5, 6, 4, 8, 6, 7, 8, 2]}";

		JSONObject idObject = new JSONObject(idData);
		JSONObject nameObject = new JSONObject(nameData);
		JSONObject dateOfBirthObject = new JSONObject(dateOfBirthData);
		JSONObject addressObject = new JSONObject(addressData);
		JSONObject phoneObject = new JSONObject(phoneData);
		JSONObject departmentObject = new JSONObject(departmentData);
		JSONObject studyYearObject = new JSONObject(studyYearData);
		JSONObject groupNumberObject = new JSONObject(groupNumberData);

		JSONArray idArray = idObject.getJSONArray("id");
		JSONArray nameArray = nameObject.getJSONArray("name");
		JSONArray dateOfBirthArray = dateOfBirthObject.getJSONArray("dateOfBirth");
		JSONArray addressArray = addressObject.getJSONArray("address");
		JSONArray phoneArray = phoneObject.getJSONArray("phone");
		JSONArray departmentArray = departmentObject.getJSONArray("department");
		JSONArray studyYearArray = studyYearObject.getJSONArray("studyYear");
		JSONArray groupNumberArray = groupNumberObject.getJSONArray("groupNumber");

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 30; i++) {
			list.add(i);
		}

		Collections.shuffle(list);

		Student[] students = new Student[30];

		for (int i = 0; i < 30; i++) {
			Student student = new Student();
			int index = list.get(i);
			student.setId(idArray.getInt(index));
			student.setName(nameArray.getString(index));
			student.setDateOfBirth(LocalDate.parse(dateOfBirthArray.getString(index)));
			student.setAddress(addressArray.getString(index));
			student.setPhone(phoneArray.getString(index));
			student.setDepartment(departmentArray.getString(index));
			student.setStudyYear(studyYearArray.getInt(index));
			student.setGroupNumber(groupNumberArray.getInt(index));

			students[i] = student;
		}

		return students;
	}
}
