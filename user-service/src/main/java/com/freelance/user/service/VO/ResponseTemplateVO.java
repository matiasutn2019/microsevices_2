package com.freelance.user.service.VO;

import com.freelance.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

  private User user;
  private Department department;

}
